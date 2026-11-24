.class public abstract La/prq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/trm0;

.field public static final b:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/trm0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/trm0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/prq;->a:La/trm0;

    .line 9
    .line 10
    new-instance v0, La/phf0;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/dj10;

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    invoke-direct {v1, v2}, La/dj10;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, La/phf0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    sget-object v1, La/u1h0;->a:[J

    .line 25
    .line 26
    new-instance v1, La/hz40;

    .line 27
    .line 28
    invoke-direct {v1}, La/hz40;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, La/phf0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v1, La/j6m0;

    .line 34
    .line 35
    const/16 v2, 0x9

    .line 36
    .line 37
    invoke-direct {v1, v2}, La/j6m0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    iput-object v1, v0, La/phf0;->c:Ljava/lang/Object;

    .line 41
    .line 42
    sput-object v0, La/prq;->b:La/phf0;

    .line 43
    .line 44
    return-void
.end method
