.class public final synthetic La/s890;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p990;


# direct methods
.method public synthetic constructor <init>(La/p990;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s890;->a:B

    iput-object p1, p0, La/s890;->b:La/p990;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/s890;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v3, p0, La/s890;->b:La/p990;

    .line 7
    .line 8
    iget-object p0, v3, La/p990;->x:La/z7z;

    .line 9
    .line 10
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p0, La/sa10;

    .line 18
    .line 19
    sget-object v0, La/pb10;->g:La/pb10;

    .line 20
    .line 21
    new-instance v1, La/cz60;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/16 v8, 0x11

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const-class v4, La/p990;

    .line 28
    .line 29
    const-string v5, "onRefreshLottieClick"

    .line 30
    .line 31
    const-string v6, "onRefreshLottieClick()V"

    .line 32
    .line 33
    invoke-direct/range {v1 .. v8}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    const-wide/16 v9, 0x2710

    .line 37
    .line 38
    const v6, 0x7f130677

    .line 39
    .line 40
    .line 41
    const v7, 0x7f131690

    .line 42
    .line 43
    .line 44
    move-object v4, p0

    .line 45
    move-object v5, v0

    .line 46
    move-object v8, v1

    .line 47
    invoke-virtual/range {v4 .. v10}, La/sa10;->a(La/pb10;IILkotlin/jvm/functions/Function0;J)La/ra10;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_0
    iget-object p0, p0, La/s890;->b:La/p990;

    .line 53
    .line 54
    iget-object p0, p0, La/p990;->x:La/z7z;

    .line 55
    .line 56
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-object v0, p0

    .line 64
    check-cast v0, La/sa10;

    .line 65
    .line 66
    sget-object v1, La/pb10;->g:La/pb10;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    const/16 v5, 0x1c

    .line 70
    .line 71
    const v2, 0x7f130677

    .line 72
    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-static/range {v0 .. v5}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
