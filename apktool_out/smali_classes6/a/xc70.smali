.class public final synthetic La/xc70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xd70;

.field public final synthetic c:La/wir;


# direct methods
.method public synthetic constructor <init>(La/xd70;La/wir;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xc70;->a:B

    iput-object p1, p0, La/xc70;->b:La/xd70;

    iput-object p2, p0, La/xc70;->c:La/wir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/xc70;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/xc70;->c:La/wir;

    .line 4
    .line 5
    iget-object p0, p0, La/xc70;->b:La/xd70;

    .line 6
    .line 7
    check-cast p1, La/k0w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, La/k0w0;->g()V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/xd70;->t:La/z7z;

    .line 19
    .line 20
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast p0, La/uzc0;

    .line 28
    .line 29
    iget-object v0, v1, La/wir;->a:Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {p0, v0}, La/uzc0;->c(La/uzc0;I)Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/xd70;->s:La/z7z;

    .line 49
    .line 50
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-object v2, p0

    .line 58
    check-cast v2, La/oct;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object p0, v1, La/wir;->b:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_0

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    :goto_0
    move v6, p0

    .line 77
    goto :goto_1

    .line 78
    :cond_0
    const/4 p0, 0x0

    .line 79
    goto :goto_0

    .line 80
    :goto_1
    const/4 v8, 0x0

    .line 81
    const/16 v9, 0x1b

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    invoke-static/range {v2 .. v9}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p1, p0}, La/k0w0;->e(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
