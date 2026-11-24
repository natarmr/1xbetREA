.class public final enum La/jye;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/jye;

.field public static final enum c:La/jye;

.field public static final enum d:La/jye;

.field public static final synthetic e:[La/jye;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/jye;

    .line 2
    .line 3
    const-string v1, "INVISIBLE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, La/jye;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/jye;->b:La/jye;

    .line 10
    .line 11
    new-instance v1, La/jye;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const v3, 0x7f13022e

    .line 15
    .line 16
    .line 17
    const-string v4, "ADDED_TO_COUPON"

    .line 18
    .line 19
    invoke-direct {v1, v4, v2, v3}, La/jye;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    sput-object v1, La/jye;->c:La/jye;

    .line 23
    .line 24
    new-instance v2, La/jye;

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    const v4, 0x7f130262

    .line 28
    .line 29
    .line 30
    const-string v5, "NOT_ADDED_TO_COUPON"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, La/jye;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v2, La/jye;->d:La/jye;

    .line 36
    .line 37
    filled-new-array {v0, v1, v2}, [La/jye;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, La/jye;->e:[La/jye;

    .line 42
    .line 43
    new-instance v0, La/c0o;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/jye;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/jye;
    .locals 1

    .line 1
    const-class v0, La/jye;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jye;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/jye;
    .locals 1

    .line 1
    sget-object v0, La/jye;->e:[La/jye;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/jye;

    .line 8
    .line 9
    return-object v0
.end method
