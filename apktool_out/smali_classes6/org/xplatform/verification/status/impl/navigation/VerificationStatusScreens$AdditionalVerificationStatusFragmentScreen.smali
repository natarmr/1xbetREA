.class public final Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:I

.field public final b:La/r9u;


# direct methods
.method public constructor <init>(ILa/r9u;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;->a:I

    .line 8
    .line 9
    iput-object p2, p0, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;->b:La/r9u;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/ygp;->A:La/ygp;

    .line 5
    .line 6
    iget-object v0, p0, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;->b:La/r9u;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, La/j1q0;->a(La/ygp;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x1

    .line 18
    iget p0, p0, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;->a:I

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    sget-object p1, La/m10;->P1:La/pek0;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance p1, La/m10;

    .line 28
    .line 29
    invoke-direct {p1}, La/m10;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object v1, La/m10;->Q1:[La/iiy;

    .line 33
    .line 34
    aget-object v0, v1, v0

    .line 35
    .line 36
    iget-object v1, p1, La/m10;->L1:La/zz2;

    .line 37
    .line 38
    invoke-virtual {v1, p1, v0, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_0
    sget-object p1, La/s10;->Q1:La/qek0;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance p1, La/s10;

    .line 48
    .line 49
    invoke-direct {p1}, La/s10;-><init>()V

    .line 50
    .line 51
    .line 52
    sget-object v1, La/s10;->R1:[La/iiy;

    .line 53
    .line 54
    aget-object v0, v1, v0

    .line 55
    .line 56
    iget-object v1, p1, La/s10;->L1:La/zz2;

    .line 57
    .line 58
    invoke-virtual {v1, p1, v0, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 59
    .line 60
    .line 61
    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/ufx;->C(La/m7h0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
