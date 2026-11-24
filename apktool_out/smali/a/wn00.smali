.class public final La/wn00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wn00;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La/vn00;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/vn00;->g:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/Map;

    .line 7
    .line 8
    iput-object v0, p0, La/wn00;->a:Ljava/util/Map;

    .line 9
    .line 10
    iget-wide v0, p1, La/vn00;->c:J

    .line 11
    .line 12
    iput-wide v0, p0, La/wn00;->b:J

    .line 13
    .line 14
    return-void
.end method
