.class public final La/l7h0;
.super La/bn70;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/l7h0;",
        "La/bn70;",
        "<init>",
        "()V",
        "scratch_card"
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
.field public static final synthetic X1:I


# instance fields
.field public U1:La/i6i;

.field public final V1:La/kiu0;

.field public final W1:La/n0o0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/bn70;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/k7h0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/k7h0;-><init>(La/l7h0;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/yxf0;

    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/wez;->b:La/wez;

    .line 18
    .line 19
    new-instance v3, La/yxf0;

    .line 20
    .line 21
    const/16 v4, 0x11

    .line 22
    .line 23
    invoke-direct {v3, v1, v4}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-class v2, La/to70;

    .line 31
    .line 32
    sget-object v3, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, La/fxf0;

    .line 39
    .line 40
    const/16 v4, 0x12

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/fxf0;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/fxf0;

    .line 46
    .line 47
    const/16 v5, 0x13

    .line 48
    .line 49
    invoke-direct {v4, v1, v5}, La/fxf0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/l7h0;->V1:La/kiu0;

    .line 57
    .line 58
    new-instance v0, La/k7h0;

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-direct {v0, p0, v1}, La/k7h0;-><init>(La/l7h0;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/l7h0;->W1:La/n0o0;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/l7h0;->W1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/qsi;

    .line 8
    .line 9
    iget-object v2, v1, La/qsi;->a:La/g8i;

    .line 10
    .line 11
    invoke-virtual {v2}, La/g8i;->j()La/ii;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iput-object v2, p0, La/bn70;->N1:La/ii;

    .line 16
    .line 17
    iget-object v1, v1, La/qsi;->b0:La/n5d0;

    .line 18
    .line 19
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La/i6i;

    .line 24
    .line 25
    iput-object v1, p0, La/l7h0;->U1:La/i6i;

    .line 26
    .line 27
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/qsi;

    .line 32
    .line 33
    iget-object v0, v0, La/qsi;->d:La/qsi;

    .line 34
    .line 35
    new-instance v1, La/r8i;

    .line 36
    .line 37
    invoke-direct {v1, v0}, La/r8i;-><init>(La/qsi;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, La/bn70;->L1:La/h5t;

    .line 41
    .line 42
    return-void
.end method

.method public final M0()Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    new-instance p0, La/l6h0;

    .line 2
    .line 3
    invoke-direct {p0}, La/l6h0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final N0(Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final Q0()La/to70;
    .locals 0

    .line 1
    iget-object p0, p0, La/l7h0;->V1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/to70;

    .line 8
    .line 9
    return-object p0
.end method
