.class public final La/zkj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lge;


# instance fields
.field public final a:I

.field public final b:La/v33;

.field public final c:La/v33;

.field public final d:La/v33;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ILa/v33;La/v33;La/v33;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, La/zkj0;->a:I

    .line 5
    .line 6
    iput-object p3, p0, La/zkj0;->b:La/v33;

    .line 7
    .line 8
    iput-object p4, p0, La/zkj0;->c:La/v33;

    .line 9
    .line 10
    iput-object p5, p0, La/zkj0;->d:La/v33;

    .line 11
    .line 12
    iput-boolean p6, p0, La/zkj0;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/bb10;La/fa10;La/tz5;)La/qde;
    .locals 0

    .line 1
    new-instance p1, La/lrs0;

    .line 2
    .line 3
    invoke-direct {p1, p3, p0}, La/lrs0;-><init>(La/tz5;La/zkj0;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Trim Path: {start: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/zkj0;->b:La/v33;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", end: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/zkj0;->c:La/v33;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", offset: "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/zkj0;->d:La/v33;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, "}"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
