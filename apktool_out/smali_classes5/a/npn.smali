.class public final La/npn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:J

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JJLjava/lang/Long;Z)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-wide p1, p0, La/npn;->a:J

    .line 18
    iput-wide p3, p0, La/npn;->c:J

    .line 19
    iput-object p5, p0, La/npn;->d:Ljava/lang/Object;

    .line 20
    iput-boolean p6, p0, La/npn;->b:Z

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;JJ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p3, p0, La/npn;->a:J

    .line 8
    .line 9
    iput-boolean p1, p0, La/npn;->b:Z

    .line 10
    .line 11
    iput-wide p5, p0, La/npn;->c:J

    .line 12
    .line 13
    iput-object p2, p0, La/npn;->d:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method
