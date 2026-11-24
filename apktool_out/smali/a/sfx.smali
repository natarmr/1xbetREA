.class public abstract La/sfx;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/hps0;


# instance fields
.field public o:La/vhv0;

.field public p:La/vhv0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/i120;->m:La/niq;

    .line 5
    .line 6
    iput-object v0, p0, La/sfx;->o:La/vhv0;

    .line 7
    .line 8
    iput-object v0, p0, La/sfx;->p:La/vhv0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public R0()V
    .locals 2

    .line 1
    new-instance v0, La/rfx;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, La/rfx;-><init>(La/sfx;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 8
    .line 9
    invoke-static {p0, v1, v0}, La/etm0;->t(La/yzj;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/sfx;->a1()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public S0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/sfx;->o:La/vhv0;

    .line 2
    .line 3
    iput-object v0, p0, La/sfx;->p:La/vhv0;

    .line 4
    .line 5
    new-instance v0, La/rfx;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, La/rfx;-><init>(La/sfx;B)V

    .line 9
    .line 10
    .line 11
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, La/etm0;->v(La/lm40;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final T0()V
    .locals 1

    .line 1
    sget-object v0, La/i120;->m:La/niq;

    .line 2
    .line 3
    iput-object v0, p0, La/sfx;->o:La/vhv0;

    .line 4
    .line 5
    return-void
.end method

.method public Z0(La/vhv0;)La/vhv0;
    .locals 0

    .line 1
    return-object p1
.end method

.method public a1()V
    .locals 2

    .line 1
    iget-object v0, p0, La/sfx;->o:La/vhv0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/sfx;->Z0(La/vhv0;)La/vhv0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, La/sfx;->p:La/vhv0;

    .line 8
    .line 9
    new-instance v0, La/rfx;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, La/rfx;-><init>(La/sfx;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 16
    .line 17
    invoke-static {p0, v1, v0}, La/etm0;->v(La/lm40;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.foundation.layout.ConsumedInsetsProvider"

    .line 2
    .line 3
    return-object p0
.end method
