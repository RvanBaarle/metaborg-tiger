package org.metaborg.lang.tiger.interp.scopesandframes.nodes;

import org.metaborg.lang.tiger.interp.scopesandframes.TigerEvalNode;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.arrays.Array_3;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.bindings.Assign_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.bindings.Let_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.bindings.__LValue2Exp___1;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.control.Break_0;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.control.For_4;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.control.IfThen_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.control.If_3;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.control.Seq_1;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.control.While_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.functions.Call_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.numbers.Gt_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.numbers.Int_1;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.numbers.Lt_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.numbers.Minus_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.numbers.Plus_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.numbers.Times_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.numbers.Uminus_1;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.records.NilExp_0;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.records.Record_2;
import org.metaborg.lang.tiger.interp.scopesandframes.nodes.strings.String_1;
import org.metaborg.lang.tiger.interpreter.generated.terms.And_2;
import org.metaborg.lang.tiger.interpreter.generated.terms.Divide_2;
import org.metaborg.lang.tiger.interpreter.generated.terms.Geq_2;
import org.metaborg.lang.tiger.interpreter.generated.terms.Leq_2;
import org.metaborg.lang.tiger.interpreter.generated.terms.Or_2;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeChrV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeConcatV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeExitV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeFlushV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeGetcharV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeNotV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeOrdV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativePrintIV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativePrintV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeSizeV_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeStartTiming_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeStopTiming_0;
import org.metaborg.lang.tiger.interpreter.generated.terms.nativeSubstringV_0;
import org.metaborg.meta.lang.dynsem.interpreter.terms.IApplTerm;
import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;

public abstract class Exp extends TigerEvalNode implements IApplTerm {

	@TruffleBoundary
	public static Exp create(IStrategoTerm term) {
		CompilerAsserts.neverPartOfCompilation();
		assert term != null;
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativePrintV", 0)) {
			return nativePrintV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativePrintIV", 0)) {
			return nativePrintIV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeOrdV", 0)) {
			return nativeOrdV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeChrV", 0)) {
			return nativeChrV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeNotV", 0)) {
			return nativeNotV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeExitV", 0)) {
			return nativeExitV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeSizeV", 0)) {
			return nativeSizeV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeSubstringV", 0)) {
			return nativeSubstringV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeConcatV", 0)) {
			return nativeConcatV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeGetcharV", 0)) {
			return nativeGetcharV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeFlushV", 0)) {
			return nativeFlushV_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeStartTiming", 0)) {
			return nativeStartTiming_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "nativeStopTiming", 0)) {
			return nativeStopTiming_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Seq", 1)) {
			return Seq_1.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "If", 3)) {
			return If_3.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "IfThen", 2)) {
			return IfThen_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "While", 2)) {
			return While_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "For", 4)) {
			return For_4.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Break", 0)) {
			return Break_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Array", 3)) {
			return Array_3.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "NilExp", 0)) {
			return NilExp_0.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Record", 2)) {
			return Record_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "String", 1)) {
			return String_1.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Int", 1)) {
			return Int_1.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Uminus", 1)) {
			return Uminus_1.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Times", 2)) {
			return Times_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Divide", 2)) {
			return Divide_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Plus", 2)) {
			return Plus_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Minus", 2)) {
			return Minus_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Eq", 2)) {
			return Eq_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Neq", 2)) {
			return Neq_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Gt", 2)) {
			return Gt_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Lt", 2)) {
			return Lt_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Geq", 2)) {
			return Geq_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Leq", 2)) {
			return Leq_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "And", 2)) {
			return And_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Or", 2)) {
			return Or_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Call", 2)) {
			return Call_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "__LValue2Exp__", 1)) {
			return __LValue2Exp___1.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Assign", 2)) {
			return Assign_2.create(term);
		}
		if (Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl) term, "Let", 2)) {
			return Let_2.create(term);
		}
		try {
			return new __LValue2Exp___1(LValue.create(term));
		} catch (IllegalStateException j_96) {
			throw new IllegalStateException("Unsupported term: " + term);
		}
	}
}