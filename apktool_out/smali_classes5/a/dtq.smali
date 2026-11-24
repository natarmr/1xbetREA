.class public final synthetic La/dtq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:F

.field public final synthetic c:Z

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(La/pz40;FZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dtq;->a:La/pz40;

    iput p2, p0, La/dtq;->b:F

    iput-boolean p3, p0, La/dtq;->c:Z

    iput-wide p4, p0, La/dtq;->d:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/dtq;->a:La/pz40;

    .line 2
    .line 3
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, La/gbc;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    iget-boolean v3, p0, La/dtq;->c:Z

    .line 15
    .line 16
    iget-wide v4, p0, La/dtq;->d:J

    .line 17
    .line 18
    invoke-direct {v0, v3, v4, v5, v2}, La/gbc;-><init>(ZJB)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v0}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, La/qmk;->a:La/zcl;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, 0x2

    .line 29
    const/high16 v3, 0x40800000    # 4.0f

    .line 30
    .line 31
    invoke-static {v0, v3, v1, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_0
    iget p0, p0, La/dtq;->b:F

    .line 36
    .line 37
    invoke-static {v1, p0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "TOTAL_CONTENT_ID"

    .line 42
    .line 43
    invoke-static {p0, v0}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
