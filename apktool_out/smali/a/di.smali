.class public final enum La/di;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:La/di;

.field public static final enum b:La/di;

.field public static final enum c:La/di;

.field public static final enum d:La/di;

.field public static final synthetic e:[La/di;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/di;

    .line 2
    .line 3
    const-string v1, "SAVE_COUPON"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/di;->a:La/di;

    .line 10
    .line 11
    new-instance v1, La/di;

    .line 12
    .line 13
    const-string v2, "DOWNLOAD_COUPON"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/di;->b:La/di;

    .line 20
    .line 21
    new-instance v2, La/di;

    .line 22
    .line 23
    const-string v3, "GENERATE_COUPON"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La/di;->c:La/di;

    .line 30
    .line 31
    new-instance v3, La/di;

    .line 32
    .line 33
    const-string v4, "SHARE_COUPON"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, La/di;->d:La/di;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [La/di;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/di;->e:[La/di;

    .line 46
    .line 47
    new-instance v0, La/c0o;

    .line 48
    .line 49
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/di;
    .locals 1

    .line 1
    const-class v0, La/di;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/di;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/di;
    .locals 1

    .line 1
    sget-object v0, La/di;->e:[La/di;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/di;

    .line 8
    .line 9
    return-object v0
.end method
