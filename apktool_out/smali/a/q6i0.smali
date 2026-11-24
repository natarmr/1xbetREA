.class public final enum La/q6i0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/xrz;


# static fields
.field public static final enum a:La/q6i0;

.field public static final synthetic b:[La/q6i0;

.field public static final synthetic c:La/c0o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/q6i0;

    .line 2
    .line 3
    sget-object v1, La/bnz;->a:La/bnz;

    .line 4
    .line 5
    const-string v1, "PERMANENT_SELF_BLOCK"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/q6i0;->a:La/q6i0;

    .line 12
    .line 13
    filled-new-array {v0}, [La/q6i0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/q6i0;->b:[La/q6i0;

    .line 18
    .line 19
    new-instance v1, La/c0o;

    .line 20
    .line 21
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, La/q6i0;->c:La/c0o;

    .line 25
    .line 26
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/q6i0;
    .locals 1

    .line 1
    const-class v0, La/q6i0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/q6i0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/q6i0;
    .locals 1

    .line 1
    sget-object v0, La/q6i0;->b:[La/q6i0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/q6i0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()La/bnz;
    .locals 0

    .line 1
    sget-object p0, La/bnz;->h:La/bnz;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()I
    .locals 0

    .line 1
    const/16 p0, 0x22

    .line 2
    .line 3
    return p0
.end method
