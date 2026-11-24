.class public La/ncq0;
.super La/z7k0;
.source "SourceFile"


# instance fields
.field public final d:J


# direct methods
.method public constructor <init>(JJLjava/lang/String;La/yyb0;)V
    .locals 0

    .line 1
    iget-object p3, p6, La/z7k0;->a:La/dvn;

    .line 2
    .line 3
    sget-object p4, La/o9d;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    .line 5
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 6
    .line 7
    .line 8
    move-result-wide p4

    .line 9
    invoke-direct {p0, p3, p4, p5}, La/z7k0;-><init>(La/dvn;J)V

    .line 10
    .line 11
    .line 12
    iput-wide p1, p0, La/ncq0;->d:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method
