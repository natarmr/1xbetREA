.class public final synthetic La/wxu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dyu0;


# direct methods
.method public synthetic constructor <init>(La/dyu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wxu0;->a:B

    iput-object p1, p0, La/wxu0;->b:La/dyu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wxu0;->a:B

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    iget-object p0, p0, La/wxu0;->b:La/dyu0;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

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
    iget-object v0, p0, La/dyu0;->y:La/duj;

    .line 16
    .line 17
    new-instance v1, La/ggt0;

    .line 18
    .line 19
    const/16 v2, 0xd

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La/dyu0;->y:La/duj;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, La/oxu0;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v1, p1

    .line 48
    :goto_0
    invoke-direct {v0, v1}, La/oxu0;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, La/dyu0;->y:La/duj;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, La/oxu0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-nez p1, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move-object v1, p1

    .line 75
    :goto_1
    invoke-direct {v0, v1}, La/oxu0;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
