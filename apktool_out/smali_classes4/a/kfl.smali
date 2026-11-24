.class public final La/kfl;
.super La/bn70;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/kfl;",
        "La/bn70;",
        "<init>",
        "()V",
        "dragons_gold"
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
    new-instance v0, La/ifl;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/ifl;-><init>(La/kfl;B)V

    .line 8
    .line 9
    .line 10
    new-instance v2, La/v9k;

    .line 11
    .line 12
    const/16 v3, 0x1d

    .line 13
    .line 14
    invoke-direct {v2, p0, v3}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v3, La/wez;->b:La/wez;

    .line 18
    .line 19
    new-instance v4, La/jfl;

    .line 20
    .line 21
    invoke-direct {v4, v2, v1}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-class v2, La/to70;

    .line 29
    .line 30
    sget-object v3, La/sre0;->a:La/tre0;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, La/b9k;

    .line 37
    .line 38
    const/16 v4, 0x12

    .line 39
    .line 40
    invoke-direct {v3, v1, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 41
    .line 42
    .line 43
    new-instance v4, La/b9k;

    .line 44
    .line 45
    const/16 v5, 0x13

    .line 46
    .line 47
    invoke-direct {v4, v1, v5}, La/b9k;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/kfl;->V1:La/kiu0;

    .line 55
    .line 56
    new-instance v0, La/ifl;

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    invoke-direct {v0, p0, v1}, La/ifl;-><init>(La/kfl;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/kfl;->W1:La/n0o0;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/kfl;->W1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/ufi;

    .line 8
    .line 9
    iget-object v2, v1, La/ufi;->a:La/g8i;

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
    iget-object v1, v1, La/ufi;->b0:La/n5d0;

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
    iput-object v1, p0, La/kfl;->U1:La/i6i;

    .line 26
    .line 27
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/ufi;

    .line 32
    .line 33
    iget-object v0, v0, La/ufi;->d:La/ufi;

    .line 34
    .line 35
    new-instance v1, La/r8i;

    .line 36
    .line 37
    invoke-direct {v1, v0}, La/r8i;-><init>(La/ufi;)V

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
    new-instance p0, La/qfl;

    .line 2
    .line 3
    invoke-direct {p0}, La/qfl;-><init>()V

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
    iget-object p0, p0, La/kfl;->V1:La/kiu0;

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
