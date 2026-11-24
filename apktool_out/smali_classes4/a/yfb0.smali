.class public final synthetic La/yfb0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/yfb0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/yfb0;

    .line 2
    .line 3
    const-string v4, "toLuckyWheelUiModel(Lorg/xplatform/games_section/feature/popular/impl/presentation/mappers/models/PopularOneXGamesMapperLuckyWheelState;)Lorg/xplatform/games_section/feature/popular/impl/presentation/models/ui/PopularOneXGamesContentItemUiModel$MediumBanner;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/nfb0;

    .line 8
    .line 9
    const-string v3, "toLuckyWheelUiModel"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/yfb0;->a:La/yfb0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/mfb0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/nfb0;->a:La/neb0;

    .line 7
    .line 8
    iget-object v0, p1, La/mfb0;->a:La/hfe;

    .line 9
    .line 10
    instance-of v1, v0, La/vee;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v1, v0, La/bfe;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-boolean p1, p1, La/mfb0;->b:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    :goto_0
    return-object p0

    .line 25
    :cond_1
    new-instance p0, La/neb0;

    .line 26
    .line 27
    check-cast v0, La/bfe;

    .line 28
    .line 29
    iget-object p1, v0, La/bfe;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, La/cfb0;

    .line 32
    .line 33
    new-instance v0, La/to30;

    .line 34
    .line 35
    iget-object v1, p1, La/cfb0;->a:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, La/cfb0;->b:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v4, La/m0x;

    .line 40
    .line 41
    const v5, 0x7f080d68

    .line 42
    .line 43
    .line 44
    const/4 v6, 0x6

    .line 45
    invoke-direct {v4, v5, v2, v6}, La/m0x;-><init>(ILa/bzw;I)V

    .line 46
    .line 47
    .line 48
    iget-boolean p1, p1, La/cfb0;->c:Z

    .line 49
    .line 50
    invoke-direct {v0, v1, v3, v4, p1}, La/to30;-><init>(Ljava/lang/String;Ljava/lang/String;La/m0x;Z)V

    .line 51
    .line 52
    .line 53
    sget-object p1, La/meb0;->a:La/meb0;

    .line 54
    .line 55
    invoke-direct {p0, v0, p1}, La/neb0;-><init>(La/vo30;La/meb0;)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    return-object v2
.end method
