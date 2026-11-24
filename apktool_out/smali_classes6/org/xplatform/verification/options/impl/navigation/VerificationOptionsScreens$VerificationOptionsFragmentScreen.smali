.class public final Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;
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
        "org/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen",
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;->b:La/r9u;

    .line 7
    .line 8
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
    sget-object p1, La/ygp;->Y:La/ygp;

    .line 5
    .line 6
    iget-object v0, p0, Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;->b:La/r9u;

    .line 7
    .line 8
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x1

    .line 20
    iget p0, p0, Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;->a:I

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget-object p1, La/v8u0;->P1:La/sxs0;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance p1, La/v8u0;

    .line 30
    .line 31
    invoke-direct {p1}, La/v8u0;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v1, La/v8u0;->Q1:[La/iiy;

    .line 35
    .line 36
    aget-object v0, v1, v0

    .line 37
    .line 38
    iget-object v1, p1, La/v8u0;->L1:La/zz2;

    .line 39
    .line 40
    invoke-virtual {v1, p1, v0, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    sget-object p1, La/a9u0;->R1:La/uxs0;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance p1, La/a9u0;

    .line 50
    .line 51
    invoke-direct {p1}, La/a9u0;-><init>()V

    .line 52
    .line 53
    .line 54
    sget-object v1, La/a9u0;->S1:[La/iiy;

    .line 55
    .line 56
    aget-object v0, v1, v0

    .line 57
    .line 58
    iget-object v1, p1, La/a9u0;->L1:La/zz2;

    .line 59
    .line 60
    invoke-virtual {v1, p1, v0, p0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 61
    .line 62
    .line 63
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
