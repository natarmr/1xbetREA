.class public final La/vig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xig;


# direct methods
.method public synthetic constructor <init>(La/xig;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vig;->a:B

    iput-object p1, p0, La/vig;->b:La/xig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte p2, p0, La/vig;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vig;->b:La/xig;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v7, p1

    .line 9
    check-cast v7, Ljava/util/List;

    .line 10
    .line 11
    sget p1, La/xig;->J:I

    .line 12
    .line 13
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 14
    .line 15
    iget-object p2, p1, La/ocj;->a:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 25
    .line 26
    move-object v1, v0

    .line 27
    move-object v0, p1

    .line 28
    check-cast v0, La/sig;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/16 v8, 0x7ff

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-static/range {v0 .. v8}, La/sig;->a(La/sig;ZLa/wcb;La/mig;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)La/sig;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    sget p1, La/xig;->J:I

    .line 61
    .line 62
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 63
    .line 64
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 65
    .line 66
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 74
    .line 75
    move-object v1, v0

    .line 76
    move-object v0, p2

    .line 77
    check-cast v0, La/sig;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    const/16 v8, 0xbff

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    invoke-static/range {v0 .. v8}, La/sig;->a(La/sig;ZLa/wcb;La/mig;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)La/sig;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p1, p2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_1

    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
