.class public final Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1",
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
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:La/we50;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/we50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;->c:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;->d:La/we50;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/oaf;->Q1:La/nwd;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;->b:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getChangePasswordScreen$1;->d:La/we50;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, La/oaf;

    .line 30
    .line 31
    invoke-direct {v2}, La/oaf;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v3, La/paf;

    .line 35
    .line 36
    invoke-direct {v3, p1, v0, v1, p0}, La/paf;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/we50;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, La/oaf;->R1:[La/iiy;

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    aget-object p0, p0, p1

    .line 43
    .line 44
    iget-object p1, v2, La/oaf;->P1:La/yzn0;

    .line 45
    .line 46
    invoke-virtual {p1, v2, p0, v3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 47
    .line 48
    .line 49
    return-object v2
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
