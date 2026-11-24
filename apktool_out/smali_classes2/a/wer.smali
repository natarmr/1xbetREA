.class public abstract La/wer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/swq;

.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public constructor <init>(La/swq;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/wer;->a:La/swq;

    .line 8
    .line 9
    iput-object p2, p0, La/wer;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput p3, p0, La/wer;->c:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(I)La/g950;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object p0, p0, La/wer;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/wer;->a:La/swq;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x2e

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/wer;->b:Ljava/lang/String;

    .line 17
    .line 18
    const/16 v1, 0x4e

    .line 19
    .line 20
    invoke-static {v0, p0, v1}, La/axq;->m(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
