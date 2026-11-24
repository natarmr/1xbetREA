.class public abstract enum La/xjf0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:La/wjf0;

.field public static final enum b:La/vjf0;

.field public static final synthetic c:[La/xjf0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/wjf0;

    .line 2
    .line 3
    invoke-direct {v0}, La/wjf0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xjf0;->a:La/wjf0;

    .line 7
    .line 8
    new-instance v1, La/vjf0;

    .line 9
    .line 10
    invoke-direct {v1}, La/vjf0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, La/xjf0;->b:La/vjf0;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    new-array v2, v2, [La/xjf0;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object v0, v2, v3

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    aput-object v1, v2, v0

    .line 23
    .line 24
    sput-object v2, La/xjf0;->c:[La/xjf0;

    .line 25
    .line 26
    new-instance v0, La/c0o;

    .line 27
    .line 28
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/xjf0;
    .locals 1

    .line 1
    const-class v0, La/xjf0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xjf0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/xjf0;
    .locals 1

    .line 1
    sget-object v0, La/xjf0;->c:[La/xjf0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/xjf0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string p0, "<"

    .line 2
    .line 3
    const-string v0, "&lt;"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, p0, v0, v1}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string p1, ">"

    .line 11
    .line 12
    const-string v0, "&gt;"

    .line 13
    .line 14
    invoke-static {p0, p1, v0, v1}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
