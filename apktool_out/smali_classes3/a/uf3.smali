.class public final La/uf3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tf3;


# instance fields
.field public final a:La/oct;

.field public final b:La/lp4;

.field public final c:La/nv20;

.field public final d:La/onv;

.field public final e:La/fvt0;


# direct methods
.method public constructor <init>(La/oct;La/lp4;La/wxs0;La/jdk0;La/nv20;La/onv;La/s9m0;La/wxs0;La/s9m0;La/fvt0;La/atz;La/sek;)V
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
    iput-object p1, p0, La/uf3;->a:La/oct;

    .line 8
    .line 9
    iput-object p2, p0, La/uf3;->b:La/lp4;

    .line 10
    .line 11
    iput-object p5, p0, La/uf3;->c:La/nv20;

    .line 12
    .line 13
    iput-object p6, p0, La/uf3;->d:La/onv;

    .line 14
    .line 15
    iput-object p10, p0, La/uf3;->e:La/fvt0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final b()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;
    .locals 1

    .line 1
    iget-object p0, p0, La/uf3;->b:La/lp4;

    .line 2
    .line 3
    invoke-interface {p0}, La/lp4;->m()La/rek0;

    .line 4
    .line 5
    .line 6
    new-instance p0, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final c()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1;
    .locals 1

    .line 1
    iget-object p0, p0, La/uf3;->b:La/lp4;

    .line 2
    .line 3
    invoke-interface {p0}, La/lp4;->m()La/rek0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, La/mq4;->c:La/mq4;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/rek0;->b(La/rek0;La/mq4;)Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final d(Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;
    .locals 2

    .line 1
    new-instance p0, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;

    .line 2
    .line 3
    sget-object v0, La/pjn0;->a:La/pjn0;

    .line 4
    .line 5
    sget-object v1, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$None;->a:Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$None;

    .line 6
    .line 7
    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;-><init>(ZLa/pjn0;Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, La/s9m0;->f(Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final e(I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;
    .locals 8

    .line 1
    const/4 v6, 0x0

    .line 2
    const/16 v7, 0x1b

    .line 3
    .line 4
    iget-object v0, p0, La/uf3;->a:La/oct;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    move v4, p1

    .line 11
    invoke-static/range {v0 .. v7}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
