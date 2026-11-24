.class public final enum Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;",
        "Landroid/os/Parcelable;",
        "",
        "uikit"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

.field public static final enum c:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

.field public static final enum d:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

.field public static final synthetic e:[Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 2
    .line 3
    const-string v1, "none"

    .line 4
    .line 5
    const-string v2, "NONE"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->b:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 12
    .line 13
    new-instance v1, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v4, "image"

    .line 17
    .line 18
    const-string v5, "IMAGE"

    .line 19
    .line 20
    invoke-direct {v1, v5, v2, v4}, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->c:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 24
    .line 25
    new-instance v2, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    const-string v5, "lottie"

    .line 29
    .line 30
    const-string v6, "LOTTIE"

    .line 31
    .line 32
    invoke-direct {v2, v6, v4, v5}, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->d:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 36
    .line 37
    filled-new-array {v0, v1, v2}, [Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->e:[Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 42
    .line 43
    new-instance v1, La/c0o;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, La/ibw0;

    .line 49
    .line 50
    const/16 v2, 0x18

    .line 51
    .line 52
    invoke-direct {v0, v2}, La/ibw0;-><init>(B)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 56
    .line 57
    const/16 v0, 0xa

    .line 58
    .line 59
    invoke-static {v1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v0}, La/wp20;->a(I)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/16 v2, 0x10

    .line 68
    .line 69
    if-ge v0, v2, :cond_0

    .line 70
    .line 71
    move v0, v2

    .line 72
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 73
    .line 74
    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 75
    .line 76
    .line 77
    new-instance v0, La/y2;

    .line 78
    .line 79
    invoke-direct {v0, v1, v3}, La/y2;-><init>(Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    move-object v3, v1

    .line 93
    check-cast v3, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 94
    .line 95
    iget-object v3, v3, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;
    .locals 1

    const-class v0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    return-object p0
.end method

.method public static values()[Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;
    .locals 1

    sget-object v0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->e:[Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
