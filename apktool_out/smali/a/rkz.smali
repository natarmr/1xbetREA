.class public final La/rkz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/blz;


# instance fields
.field public final a:La/skz;

.field public final b:La/clz;


# direct methods
.method public constructor <init>(La/clz;La/skz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rkz;->b:La/clz;

    .line 5
    .line 6
    iput-object p2, p0, La/rkz;->a:La/skz;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onDestroy(La/clz;)V
    .locals 0
    .annotation runtime La/kh60;
        value = .enum La/kkz;->ON_DESTROY:La/kkz;
    .end annotation

    .line 1
    iget-object p0, p0, La/rkz;->a:La/skz;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/skz;->l(La/clz;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStart(La/clz;)V
    .locals 0
    .annotation runtime La/kh60;
        value = .enum La/kkz;->ON_START:La/kkz;
    .end annotation

    .line 1
    iget-object p0, p0, La/rkz;->a:La/skz;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/skz;->g(La/clz;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop(La/clz;)V
    .locals 0
    .annotation runtime La/kh60;
        value = .enum La/kkz;->ON_STOP:La/kkz;
    .end annotation

    .line 1
    iget-object p0, p0, La/rkz;->a:La/skz;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/skz;->h(La/clz;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
