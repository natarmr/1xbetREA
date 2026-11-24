.class public final synthetic La/mql0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mql0;->a:B

    iput-object p1, p0, La/mql0;->b:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/mql0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/mql0;->b:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/ud9;

    .line 11
    .line 12
    iget-object v3, p0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    new-instance v4, La/m0x;

    .line 19
    .line 20
    iget p0, p0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->g:I

    .line 21
    .line 22
    invoke-direct {v4, p0, v2, v1}, La/m0x;-><init>(ILa/bzw;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v4, v3}, La/ud9;-><init>(La/m0x;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    new-instance v0, La/ke9;

    .line 30
    .line 31
    iget-object v3, p0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->e:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v4, La/m0x;

    .line 38
    .line 39
    iget p0, p0, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->f:I

    .line 40
    .line 41
    invoke-direct {v4, p0, v2, v1}, La/m0x;-><init>(ILa/bzw;I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v4, v3}, La/ke9;-><init>(La/m0x;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
