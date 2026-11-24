.class public final La/rdj0;
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
    sget-object v0, La/qdj0;->c:La/qdj0;

    .line 2
    .line 3
    sget-object v1, La/qdj0;->a:La/qdj0;

    .line 4
    .line 5
    sget-object v2, La/qdj0;->b:La/qdj0;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [La/qdj0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/rdj0;->d:Ljava/util/List;

    .line 16
    .line 17
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
    iput-object p1, p0, La/rdj0;->a:La/q7d0;

    .line 14
    .line 15
    iput-object p3, p0, La/rdj0;->b:La/zoq0;

    .line 16
    .line 17
    iput-object p2, p0, La/rdj0;->c:La/knf0;

    .line 18
    .line 19
    return-void
.end method
