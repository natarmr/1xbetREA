.class public final La/dvn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final c:La/dvn;

.field public static d:La/yyb0;

.field public static final e:La/avn;


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/dvn;

    .line 2
    .line 3
    invoke-direct {v0}, La/dvn;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dvn;->c:La/dvn;

    .line 7
    .line 8
    new-instance v7, La/run;

    .line 9
    .line 10
    invoke-direct {v7, v0}, La/run;-><init>(La/dvn;)V

    .line 11
    .line 12
    .line 13
    sput-object v7, La/dvn;->d:La/yyb0;

    .line 14
    .line 15
    new-instance v1, La/avn;

    .line 16
    .line 17
    const-wide/16 v4, -0x1

    .line 18
    .line 19
    const-string v6, "Empty Thread"

    .line 20
    .line 21
    const-wide/16 v2, -0x1

    .line 22
    .line 23
    invoke-direct/range {v1 .. v7}, La/ncq0;-><init>(JJLjava/lang/String;La/yyb0;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, La/dvn;->e:La/avn;

    .line 27
    .line 28
    sget-object v0, La/o9d;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, La/evn;->a:La/evn;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/dvn;->a:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    sget-object p0, La/evn;->a:La/evn;

    .line 2
    .line 3
    invoke-virtual {p0}, La/evn;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
