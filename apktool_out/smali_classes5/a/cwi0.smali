.class public final synthetic La/cwi0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# static fields
.field public static final a:La/cwi0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/cwi0;

    .line 2
    .line 3
    const-string v4, "compareKey(ILorg/xplatform/settings/impl/presentation/adapter/model/SettingsUiModel;)Ljava/lang/Object;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x2

    .line 7
    const-class v2, La/dwi0;

    .line 8
    .line 9
    const-string v3, "compareKey"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/cwi0;->a:La/cwi0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    check-cast p2, La/hej0;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of p1, p2, La/wev0;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    instance-of p1, p2, La/aaj0;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_1
    instance-of p1, p2, La/nzi0;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    check-cast p2, La/nzi0;

    .line 41
    .line 42
    iget-object p0, p2, La/nzi0;->a:Ljava/lang/String;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    instance-of p1, p2, La/qfj0;

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    instance-of p1, p2, La/hzi0;

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    const p0, 0x7f08027f

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    instance-of p1, p2, La/g4k;

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    goto :goto_0

    .line 83
    :cond_5
    instance-of p1, p2, La/mv00;

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    goto :goto_0

    .line 96
    :cond_6
    instance-of p1, p2, La/b8j0;

    .line 97
    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    check-cast p2, La/b8j0;

    .line 101
    .line 102
    invoke-interface {p2}, La/b8j0;->getTitle()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    goto :goto_0

    .line 107
    :cond_7
    instance-of p1, p2, La/wgj0;

    .line 108
    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    check-cast p2, La/wgj0;

    .line 112
    .line 113
    invoke-interface {p2}, La/wgj0;->getTitle()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    goto :goto_0

    .line 118
    :cond_8
    instance-of p1, p2, La/vhj0;

    .line 119
    .line 120
    if-eqz p1, :cond_9

    .line 121
    .line 122
    check-cast p2, La/vhj0;

    .line 123
    .line 124
    iget-object p0, p2, La/vhj0;->a:Ljava/lang/String;

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_9
    instance-of p1, p2, La/vdj0;

    .line 128
    .line 129
    if-eqz p1, :cond_a

    .line 130
    .line 131
    check-cast p2, La/vdj0;

    .line 132
    .line 133
    invoke-interface {p2}, La/vdj0;->getTitle()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    goto :goto_0

    .line 138
    :cond_a
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    return-object p0
.end method
