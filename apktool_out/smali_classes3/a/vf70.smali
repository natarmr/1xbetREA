.class public final La/vf70;
.super La/sf70;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/vf70;",
        "La/sf70;",
        "<init>",
        "()V",
        "core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic Q1:I


# instance fields
.field public final N1:La/i9o0;

.field public O1:La/m6i;

.field public final P1:La/kiu0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/sf70;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 5
    .line 6
    iput-object v0, p0, La/vf70;->N1:La/i9o0;

    .line 7
    .line 8
    new-instance v0, La/pu50;

    .line 9
    .line 10
    const/16 v1, 0x19

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/ej50;

    .line 16
    .line 17
    const/16 v2, 0x1a

    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    sget-object v2, La/wez;->b:La/wez;

    .line 23
    .line 24
    new-instance v3, La/ej50;

    .line 25
    .line 26
    const/16 v4, 0x1b

    .line 27
    .line 28
    invoke-direct {v3, v1, v4}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v2, La/xf70;

    .line 36
    .line 37
    sget-object v3, La/sre0;->a:La/tre0;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, La/co60;

    .line 44
    .line 45
    const/16 v4, 0x16

    .line 46
    .line 47
    invoke-direct {v3, v1, v4}, La/co60;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/co60;

    .line 51
    .line 52
    const/16 v5, 0x17

    .line 53
    .line 54
    invoke-direct {v4, v1, v5}, La/co60;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/vf70;->P1:La/kiu0;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    instance-of v2, v0, La/bn70;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, La/bn70;

    .line 20
    .line 21
    :cond_1
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v0, v1, La/bn70;->L1:La/h5t;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {v0, p0}, La/h5t;->i(La/vf70;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    return-void
.end method

.method public final H0()La/uf70;
    .locals 0

    .line 1
    iget-object p0, p0, La/vf70;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xf70;

    .line 8
    .line 9
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vf70;->N1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
