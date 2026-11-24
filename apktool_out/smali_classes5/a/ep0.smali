.class public final enum La/ep0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/sgf0;


# static fields
.field public static final enum b:La/ep0;

.field public static final enum c:La/ep0;

.field public static final synthetic d:[La/ep0;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ep0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "smallHeader"

    .line 5
    .line 6
    const-string v3, "SMALL_HEADER"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/ep0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/ep0;->b:La/ep0;

    .line 12
    .line 13
    new-instance v1, La/ep0;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "providerChips"

    .line 17
    .line 18
    const-string v4, "PROVIDER_CHIPS"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/ep0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/ep0;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    const-string v4, "largeHeader"

    .line 27
    .line 28
    const-string v5, "LARGE_HEADER"

    .line 29
    .line 30
    invoke-direct {v2, v5, v3, v4}, La/ep0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v2, La/ep0;->c:La/ep0;

    .line 34
    .line 35
    filled-new-array {v0, v1, v2}, [La/ep0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, La/ep0;->d:[La/ep0;

    .line 40
    .line 41
    new-instance v0, La/c0o;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/ep0;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/ep0;
    .locals 1

    .line 1
    const-class v0, La/ep0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ep0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/ep0;
    .locals 1

    .line 1
    sget-object v0, La/ep0;->d:[La/ep0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/ep0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "aggregatorFilterScreenStyle"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ep0;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
