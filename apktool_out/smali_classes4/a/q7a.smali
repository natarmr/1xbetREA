.class public final La/q7a;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/ehl;


# instance fields
.field public final o:La/p7m0;


# direct methods
.method public constructor <init>(La/x7a;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, La/q7a;->o:La/p7m0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/qv3;

    .line 6
    .line 7
    const/16 v2, 0x1b

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, v3, v2}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final u0(La/g7z;)V
    .locals 8

    .line 1
    iget-object p0, p0, La/q7a;->o:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/x7a;

    .line 8
    .line 9
    iget-object v1, v0, La/x7a;->a:La/dfv;

    .line 10
    .line 11
    new-instance v0, La/d38;

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    invoke-direct {v0, p1, v2}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p1, La/g7z;->a:La/a6a;

    .line 19
    .line 20
    invoke-interface {v2}, La/fhl;->d()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-static {v2, v3}, La/n2x;->N(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    iget-object v2, p1, La/g7z;->b:La/ehl;

    .line 29
    .line 30
    invoke-virtual {p1}, La/g7z;->getLayoutDirection()La/k6z;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v6, La/k9v;

    .line 35
    .line 36
    const/16 v7, 0xa

    .line 37
    .line 38
    invoke-direct {v6, p1, v2, v0, v7}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    move-object v2, p1

    .line 42
    invoke-virtual/range {v1 .. v6}, La/dfv;->f(La/w6k;La/k6z;JLkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, La/x7a;

    .line 50
    .line 51
    iget-object p0, p0, La/x7a;->a:La/dfv;

    .line 52
    .line 53
    invoke-static {v2, p0}, La/agc;->I(La/fhl;La/dfv;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
