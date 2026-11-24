.class public final La/g80;
.super La/bn70;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/g80;",
        "La/bn70;",
        "<init>",
        "()V",
        "african_roulette"
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
    .locals 7

    .line 1
    invoke-direct {p0}, La/bn70;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/e80;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/e80;-><init>(La/g80;B)V

    .line 8
    .line 9
    .line 10
    new-instance v2, La/uzv0;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, p0, v3}, La/uzv0;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    sget-object v4, La/wez;->b:La/wez;

    .line 17
    .line 18
    new-instance v5, La/f80;

    .line 19
    .line 20
    invoke-direct {v5, v2, v1}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-class v2, La/to70;

    .line 28
    .line 29
    sget-object v4, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v4, La/k8;

    .line 36
    .line 37
    const/16 v5, 0x14

    .line 38
    .line 39
    invoke-direct {v4, v1, v5}, La/k8;-><init>(La/a8z;B)V

    .line 40
    .line 41
    .line 42
    new-instance v5, La/k8;

    .line 43
    .line 44
    const/16 v6, 0x15

    .line 45
    .line 46
    invoke-direct {v5, v1, v6}, La/k8;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v2, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/g80;->V1:La/kiu0;

    .line 54
    .line 55
    new-instance v0, La/e80;

    .line 56
    .line 57
    invoke-direct {v0, p0, v3}, La/e80;-><init>(La/g80;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/g80;->W1:La/n0o0;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/g80;->W1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/k6i;

    .line 8
    .line 9
    iget-object v2, v1, La/k6i;->a:La/g8i;

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
    iget-object v1, v1, La/k6i;->b0:La/n5d0;

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
    iput-object v1, p0, La/g80;->U1:La/i6i;

    .line 26
    .line 27
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/k6i;

    .line 32
    .line 33
    iget-object v0, v0, La/k6i;->d:La/k6i;

    .line 34
    .line 35
    new-instance v1, La/db;

    .line 36
    .line 37
    invoke-direct {v1, v0}, La/db;-><init>(La/k6i;)V

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
    sget-object p0, La/n80;->U1:La/jdk0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, La/n80;

    .line 7
    .line 8
    invoke-direct {p0}, La/n80;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final N0(Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 8

    .line 1
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, La/bn70;->L0()La/zk70;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object v0, p0, La/zk70;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/16 v7, 0x1fe

    .line 11
    .line 12
    const-string v1, "/static/img/android/games/background/africanroulete/new_back.webp"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-static/range {v0 .. v7}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final Q0()La/to70;
    .locals 0

    .line 1
    iget-object p0, p0, La/g80;->V1:La/kiu0;

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
