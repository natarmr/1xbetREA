.class public final La/g2a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fag0;


# instance fields
.field public final synthetic b:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/g2a;->b:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/g2a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b(La/f2a;)La/eag0;
    .locals 0

    .line 1
    iget-byte p0, p1, La/f2a;->a:B

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    sget-object p0, La/eag0;->d:La/eag0;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object p0, La/eag0;->e:La/eag0;

    .line 10
    .line 11
    return-object p0
.end method
