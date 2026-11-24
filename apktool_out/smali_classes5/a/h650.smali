.class public final enum La/h650;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/sgf0;


# static fields
.field public static final enum b:La/h650;

.field public static final synthetic c:[La/h650;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, La/h650;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "squareS"

    .line 5
    .line 6
    const-string v3, "SQUARE_S"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/h650;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v3, "squareSNoTitle"

    .line 15
    .line 16
    const-string v4, "SQUARE_S_NO_TITLE"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/h650;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const-string v4, "squareL"

    .line 25
    .line 26
    const-string v5, "SQUARE_L"

    .line 27
    .line 28
    invoke-direct {v2, v5, v3, v4}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/h650;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const-string v5, "squareLNoTitle"

    .line 35
    .line 36
    const-string v6, "SQUARE_L_NO_TITLE"

    .line 37
    .line 38
    invoke-direct {v3, v6, v4, v5}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/h650;

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    const-string v6, "rectangleVertical"

    .line 45
    .line 46
    const-string v7, "RECTANGLE_VERTICAL"

    .line 47
    .line 48
    invoke-direct {v4, v7, v5, v6}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/h650;

    .line 52
    .line 53
    const/4 v6, 0x5

    .line 54
    const-string v7, "rectangleVerticalNoTitle"

    .line 55
    .line 56
    const-string v8, "RECTANGLE_VERTICAL_NO_TITLE"

    .line 57
    .line 58
    invoke-direct {v5, v8, v6, v7}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, La/h650;

    .line 62
    .line 63
    const/4 v7, 0x6

    .line 64
    const-string v8, "rectangleHorizontal"

    .line 65
    .line 66
    const-string v9, "RECTANGLE_HORIZONTAL"

    .line 67
    .line 68
    invoke-direct {v6, v9, v7, v8}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v7, La/h650;

    .line 72
    .line 73
    const/4 v8, 0x7

    .line 74
    const-string v9, "rectangleHorizontalNoTitle"

    .line 75
    .line 76
    const-string v10, "RECTANGLE_HORIZONTAL_NO_TITLE"

    .line 77
    .line 78
    invoke-direct {v7, v10, v8, v9}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v8, La/h650;

    .line 82
    .line 83
    const/16 v9, 0x8

    .line 84
    .line 85
    const-string v10, "cardHorizontal"

    .line 86
    .line 87
    const-string v11, "CARD_HORIZONTAL"

    .line 88
    .line 89
    invoke-direct {v8, v11, v9, v10}, La/h650;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sput-object v8, La/h650;->b:La/h650;

    .line 93
    .line 94
    filled-new-array/range {v0 .. v8}, [La/h650;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sput-object v0, La/h650;->c:[La/h650;

    .line 99
    .line 100
    new-instance v0, La/c0o;

    .line 101
    .line 102
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/h650;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/h650;
    .locals 1

    .line 1
    const-class v0, La/h650;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/h650;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/h650;
    .locals 1

    .line 1
    sget-object v0, La/h650;->c:[La/h650;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/h650;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "myAggregatorPromotionsBannerStyle"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/h650;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
