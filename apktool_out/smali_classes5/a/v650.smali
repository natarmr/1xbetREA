.class public final La/v650;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/List;


# instance fields
.field public final a:La/q7d0;

.field public final b:La/zoq0;

.field public final c:La/knf0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [La/t650;

    .line 3
    .line 4
    sget-object v1, La/s650;->a:La/s650;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, La/r650;->a:La/r650;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/v650;->d:Ljava/util/List;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/q7d0;La/knf0;La/zoq0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/v650;->a:La/q7d0;

    .line 14
    .line 15
    iput-object p3, p0, La/v650;->b:La/zoq0;

    .line 16
    .line 17
    iput-object p2, p0, La/v650;->c:La/knf0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    const-string v0, "TIPS_MY_AGGREGATOR_SHOWED"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/v650;->a:La/q7d0;

    .line 5
    .line 6
    invoke-static {p0, v0, v1}, La/ua80;->c(La/q7d0;Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method
