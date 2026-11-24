.class public final La/y43;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# static fields
.field public static final b:La/y43;

.field public static final c:La/y43;

.field public static final d:La/y43;

.field public static final e:La/y43;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/y43;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, La/y43;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/y43;->b:La/y43;

    .line 9
    .line 10
    new-instance v0, La/y43;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, La/y43;-><init>(IB)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/y43;->c:La/y43;

    .line 17
    .line 18
    new-instance v0, La/y43;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, La/y43;-><init>(IB)V

    .line 22
    .line 23
    .line 24
    sput-object v0, La/y43;->d:La/y43;

    .line 25
    .line 26
    new-instance v0, La/y43;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, La/y43;-><init>(IB)V

    .line 30
    .line 31
    .line 32
    sput-object v0, La/y43;->e:La/y43;

    .line 33
    .line 34
    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y43;->a:B

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/y43;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, La/fqs0;

    .line 8
    .line 9
    check-cast p2, La/fqs0;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, La/fqs0;->a(La/fqs0;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    check-cast p1, Lkotlin/text/MatchResult;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance p0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Lkotlin/text/MatchResult;->a()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x22

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-interface {p1}, Lkotlin/text/MatchResult;->a()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const/4 p2, 0x2

    .line 80
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_2
    check-cast p1, La/azn;

    .line 95
    .line 96
    check-cast p2, La/azn;

    .line 97
    .line 98
    if-ne p1, p2, :cond_0

    .line 99
    .line 100
    sget-object p0, La/azn;->c:La/azn;

    .line 101
    .line 102
    if-ne p2, p0, :cond_0

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    const/4 v0, 0x0

    .line 106
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_3
    check-cast p1, La/qkx;

    .line 112
    .line 113
    iget-wide p0, p1, La/qkx;->a:J

    .line 114
    .line 115
    check-cast p2, La/qkx;

    .line 116
    .line 117
    iget-wide p0, p2, La/qkx;->a:J

    .line 118
    .line 119
    sget-object p0, La/quu0;->a:Ljava/util/Map;

    .line 120
    .line 121
    new-instance p0, La/qkx;

    .line 122
    .line 123
    const-wide p1, 0x100000001L

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    invoke-direct {p0, p1, p2}, La/qkx;-><init>(J)V

    .line 129
    .line 130
    .line 131
    const/4 p1, 0x0

    .line 132
    const/high16 p2, 0x43c80000    # 400.0f

    .line 133
    .line 134
    invoke-static {p1, p2, p0, v0}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
