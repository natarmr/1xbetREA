.class public final synthetic La/fuh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zuh0;


# direct methods
.method public synthetic constructor <init>(La/zuh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fuh0;->a:B

    iput-object p1, p0, La/fuh0;->b:La/zuh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/fuh0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/fuh0;->b:La/zuh0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Throwable;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, La/yuh0;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p1, v2, p2, v1, v0}, La/yuh0;-><init>(La/zuh0;Ljava/lang/String;La/yje;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p0, p1}, La/zuh0;->w(La/bvc;Lkotlin/jvm/functions/Function2;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    move-object v1, p1

    .line 33
    check-cast v1, Ljava/lang/Throwable;

    .line 34
    .line 35
    move-object v3, p2

    .line 36
    check-cast v3, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, La/fuh0;->b:La/zuh0;

    .line 48
    .line 49
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v0, La/qkb0;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    const/16 v5, 0xe

    .line 57
    .line 58
    invoke-direct/range {v0 .. v5}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p0, v0}, La/zuh0;->w(La/bvc;Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 68
    .line 69
    check-cast p2, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 78
    .line 79
    .line 80
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance p1, La/yuh0;

    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    invoke-direct {p1, v2, p2, v1, v0}, La/yuh0;-><init>(La/zuh0;Ljava/lang/String;La/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, p0, p1}, La/zuh0;->w(La/bvc;Lkotlin/jvm/functions/Function2;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
