.class public final La/uiz;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/vld;
.implements La/t7v;


# instance fields
.field public o:La/e03;

.field public p:La/djz;

.field public q:La/k7q0;

.field public final r:La/pz40;


# direct methods
.method public constructor <init>(La/e03;La/djz;La/k7q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uiz;->o:La/e03;

    .line 5
    .line 6
    iput-object p2, p0, La/uiz;->p:La/djz;

    .line 7
    .line 8
    iput-object p3, p0, La/uiz;->q:La/k7q0;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, La/uiz;->r:La/pz40;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final P(La/s460;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/uiz;->r:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final R0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/uiz;->o:La/e03;

    .line 2
    .line 3
    iget-object v1, v0, La/e03;->a:La/uiz;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v1, "Expected textInputModifierNode to be null"

    .line 9
    .line 10
    invoke-static {v1}, La/adx;->c(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iput-object p0, v0, La/e03;->a:La/uiz;

    .line 14
    .line 15
    return-void
.end method

.method public final S0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/uiz;->o:La/e03;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La/e03;->k(La/uiz;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
