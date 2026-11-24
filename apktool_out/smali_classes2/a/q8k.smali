.class public final enum La/q8k;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/xrz;


# static fields
.field public static final enum b:La/q8k;

.field public static final enum c:La/q8k;

.field public static final enum d:La/q8k;

.field public static final enum e:La/q8k;

.field public static final synthetic f:[La/q8k;

.field public static final synthetic g:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/q8k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x14

    .line 5
    .line 6
    const-string v3, "DEPOSIT_LIMIT_1_DAY"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/q8k;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/q8k;->b:La/q8k;

    .line 12
    .line 13
    new-instance v1, La/q8k;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/16 v3, 0x15

    .line 17
    .line 18
    const-string v4, "DEPOSIT_LIMIT_7_DAY"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/q8k;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/q8k;->c:La/q8k;

    .line 24
    .line 25
    new-instance v2, La/q8k;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const/16 v4, 0x16

    .line 29
    .line 30
    const-string v5, "DEPOSIT_LIMIT_30_DAY"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, La/q8k;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v2, La/q8k;->d:La/q8k;

    .line 36
    .line 37
    new-instance v3, La/q8k;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const/16 v5, 0x17

    .line 41
    .line 42
    const-string v6, "DEPOSIT_LIMIT_UNTIL_VERIFICATION"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, La/q8k;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    sput-object v3, La/q8k;->e:La/q8k;

    .line 48
    .line 49
    filled-new-array {v0, v1, v2, v3}, [La/q8k;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, La/q8k;->f:[La/q8k;

    .line 54
    .line 55
    new-instance v1, La/c0o;

    .line 56
    .line 57
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 58
    .line 59
    .line 60
    sput-object v1, La/q8k;->g:La/c0o;

    .line 61
    .line 62
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    .line 1
    sget-object v0, La/bnz;->a:La/bnz;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    iput-byte p3, p0, La/q8k;->a:B

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/q8k;
    .locals 1

    .line 1
    const-class v0, La/q8k;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/q8k;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/q8k;
    .locals 1

    .line 1
    sget-object v0, La/q8k;->f:[La/q8k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/q8k;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()La/bnz;
    .locals 0

    .line 1
    sget-object p0, La/bnz;->b:La/bnz;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()I
    .locals 0

    .line 1
    iget-byte p0, p0, La/q8k;->a:B

    .line 2
    .line 3
    return p0
.end method
