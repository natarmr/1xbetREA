.class public final Lorg/xplatform/toto_bet/core/navigation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r9u;


# direct methods
.method public constructor <init>(La/r9u;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/xplatform/toto_bet/core/navigation/a;->a:La/r9u;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/toto_bet/core/navigation/TotoBetScreenFactoryImpl$TotoBetRootFragmentScreen;

    .line 2
    .line 3
    new-instance v1, Lorg/xplatform/toto_bet/active_tirage/presentation/screen/TotoBetDsScreen;

    .line 4
    .line 5
    sget-object v2, La/ygp;->H1:La/ygp;

    .line 6
    .line 7
    iget-object p0, p0, Lorg/xplatform/toto_bet/core/navigation/a;->a:La/r9u;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-direct {v1, p0}, Lorg/xplatform/toto_bet/active_tirage/presentation/screen/TotoBetDsScreen;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lorg/xplatform/toto_bet/core/navigation/TotoBetScreenFactoryImpl$TotoBetRootFragmentScreen;-><init>(Lorg/xplatform/toto_bet/active_tirage/presentation/screen/TotoBetDsScreen;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method
