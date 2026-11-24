.class public final synthetic La/ctq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/xdr;

.field public final synthetic b:La/xdr;

.field public final synthetic c:La/xdr;

.field public final synthetic d:La/pz40;

.field public final synthetic e:F

.field public final synthetic f:Z

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(La/xdr;La/xdr;La/xdr;La/pz40;FZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ctq;->a:La/xdr;

    iput-object p2, p0, La/ctq;->b:La/xdr;

    iput-object p3, p0, La/ctq;->c:La/xdr;

    iput-object p4, p0, La/ctq;->d:La/pz40;

    iput p5, p0, La/ctq;->e:F

    iput-boolean p6, p0, La/ctq;->f:Z

    iput-wide p7, p0, La/ctq;->g:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, La/jm40;->b:La/jm40;

    .line 2
    .line 3
    iget-object v1, p0, La/ctq;->a:La/xdr;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, La/ctq;->b:La/xdr;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, La/ctq;->c:La/xdr;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, La/ctq;->d:La/pz40;

    .line 16
    .line 17
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    :cond_0
    new-instance v1, La/gbc;

    .line 24
    .line 25
    iget-boolean v2, p0, La/ctq;->f:Z

    .line 26
    .line 27
    iget-wide v3, p0, La/ctq;->g:J

    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    invoke-direct {v1, v2, v3, v4, v5}, La/gbc;-><init>(ZJB)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, La/qmk;->a:La/zcl;

    .line 38
    .line 39
    const/high16 v1, 0x40800000    # 4.0f

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {v0, v1, v2, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_1
    iget p0, p0, La/ctq;->e:F

    .line 47
    .line 48
    invoke-static {v0, p0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v0, "TOTAL_CONTENT_ID"

    .line 53
    .line 54
    invoke-static {p0, v0}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
