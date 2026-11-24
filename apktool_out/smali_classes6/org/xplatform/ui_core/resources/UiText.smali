.class public abstract Lorg/xplatform/ui_core/resources/UiText;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime La/lbk;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/ui_core/resources/UiText$ByIntRes;,
        Lorg/xplatform/ui_core/resources/UiText$ByRes;,
        Lorg/xplatform/ui_core/resources/UiText$ByString;,
        Lorg/xplatform/ui_core/resources/UiText$Combined;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/xplatform/ui_core/resources/UiText;",
        "Landroid/os/Parcelable;",
        "ByString",
        "ByRes",
        "ByIntRes",
        "Combined",
        "Lorg/xplatform/ui_core/resources/UiText$ByIntRes;",
        "Lorg/xplatform/ui_core/resources/UiText$ByRes;",
        "Lorg/xplatform/ui_core/resources/UiText$ByString;",
        "Lorg/xplatform/ui_core/resources/UiText$Combined;",
        "ui_core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/CharSequence;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lorg/xplatform/ui_core/resources/UiText$ByString;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/ui_core/resources/UiText$ByString;

    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/ui_core/resources/UiText$ByString;->a:Ljava/lang/CharSequence;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v0, p0, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p0, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 18
    .line 19
    iget-object v0, p0, Lorg/xplatform/ui_core/resources/UiText$ByRes;->b:[Ljava/lang/CharSequence;

    .line 20
    .line 21
    array-length v1, v0

    .line 22
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget p0, p0, Lorg/xplatform/ui_core/resources/UiText$ByRes;->a:I

    .line 27
    .line 28
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    instance-of v0, p0, Lorg/xplatform/ui_core/resources/UiText$ByIntRes;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    check-cast p0, Lorg/xplatform/ui_core/resources/UiText$ByIntRes;

    .line 42
    .line 43
    iget-object v0, p0, Lorg/xplatform/ui_core/resources/UiText$ByIntRes;->b:[I

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    array-length v2, v0

    .line 49
    new-array v3, v2, [Ljava/lang/Integer;

    .line 50
    .line 51
    array-length v4, v0

    .line 52
    :goto_0
    if-ge v1, v4, :cond_2

    .line 53
    .line 54
    aget v5, v0, v1

    .line 55
    .line 56
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    aput-object v5, v3, v1

    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget p0, p0, Lorg/xplatform/ui_core/resources/UiText$ByIntRes;->a:I

    .line 70
    .line 71
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_3
    instance-of v0, p0, Lorg/xplatform/ui_core/resources/UiText$Combined;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    check-cast p0, Lorg/xplatform/ui_core/resources/UiText$Combined;

    .line 84
    .line 85
    new-instance v0, Ljava/util/ArrayList;

    .line 86
    .line 87
    const/16 v2, 0xa

    .line 88
    .line 89
    iget-object v3, p0, Lorg/xplatform/ui_core/resources/UiText$Combined;->b:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_4

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Lorg/xplatform/ui_core/resources/UiText;

    .line 113
    .line 114
    invoke-virtual {v3, p1}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    new-array v1, v1, [Ljava/lang/CharSequence;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, [Ljava/lang/CharSequence;

    .line 129
    .line 130
    array-length v1, v0

    .line 131
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget p0, p0, Lorg/xplatform/ui_core/resources/UiText$Combined;->a:I

    .line 136
    .line 137
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 146
    .line 147
    .line 148
    const/4 p0, 0x0

    .line 149
    return-object p0
.end method
