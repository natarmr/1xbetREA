.class public final enum La/k77;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/sgf0;
.implements Ljava/io/Serializable;


# static fields
.field public static final enum b:La/k77;

.field public static final enum c:La/k77;

.field public static final enum d:La/k77;

.field public static final enum e:La/k77;

.field public static final enum f:La/k77;

.field public static final enum g:La/k77;

.field public static final synthetic h:[La/k77;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/k77;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "noTabsClassic"

    .line 5
    .line 6
    const-string v3, "NO_TABS_CLASSIC"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/k77;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/k77;->b:La/k77;

    .line 12
    .line 13
    new-instance v1, La/k77;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "tabsExpandableCards"

    .line 17
    .line 18
    const-string v4, "TABS_EXPANDABLE_CARDS"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/k77;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/k77;->c:La/k77;

    .line 24
    .line 25
    new-instance v2, La/k77;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "noTabsExpandableCards"

    .line 29
    .line 30
    const-string v5, "NO_TABS_EXPANDABLE_CARDS"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, La/k77;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, La/k77;->d:La/k77;

    .line 36
    .line 37
    new-instance v3, La/k77;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v5, "compactNoExpand"

    .line 41
    .line 42
    const-string v6, "COMPACT_NO_EXPAND"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, La/k77;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, La/k77;->e:La/k77;

    .line 48
    .line 49
    new-instance v4, La/k77;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-string v6, "tabsAndAccordeon"

    .line 53
    .line 54
    const-string v7, "TABS_AND_ACCORDEON"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, La/k77;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, La/k77;->f:La/k77;

    .line 60
    .line 61
    new-instance v5, La/k77;

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    const-string v7, "oldHistory"

    .line 65
    .line 66
    const-string v8, "OLD_HISTORY"

    .line 67
    .line 68
    invoke-direct {v5, v8, v6, v7}, La/k77;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v5, La/k77;->g:La/k77;

    .line 72
    .line 73
    filled-new-array/range {v0 .. v5}, [La/k77;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, La/k77;->h:[La/k77;

    .line 78
    .line 79
    new-instance v0, La/c0o;

    .line 80
    .line 81
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/k77;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/k77;
    .locals 1

    .line 1
    const-class v0, La/k77;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k77;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/k77;
    .locals 1

    .line 1
    sget-object v0, La/k77;->h:[La/k77;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/k77;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "betHistoryStyle"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/k77;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
