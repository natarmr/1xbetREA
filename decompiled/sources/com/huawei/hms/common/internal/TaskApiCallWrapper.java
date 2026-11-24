package com.huawei.hms.common.internal;

import a.fuo0;

/* JADX INFO: loaded from: classes2.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskApiCall<? extends AnyClient, TResult> f45803a;
    private final fuo0 b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, fuo0 fuo0Var) {
        super(1);
        this.f45803a = taskApiCall;
        this.b = fuo0Var;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f45803a;
    }

    public fuo0 getTaskCompletionSource() {
        return this.b;
    }
}
