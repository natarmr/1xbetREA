.class public final La/d8w0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Lokhttp3/Request$Builder;

.field public j:Lokhttp3/Request$Builder;

.field public k:Ljava/lang/String;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/owp0;

.field public n:I


# direct methods
.method public constructor <init>(La/owp0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d8w0;->m:La/owp0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iput-object p1, p0, La/d8w0;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/d8w0;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/d8w0;->n:I

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    const/4 v10, 0x0

    .line 12
    iget-object v0, p0, La/d8w0;->m:La/owp0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    move-object v11, p0

    .line 23
    invoke-virtual/range {v0 .. v11}, La/owp0;->f(Lokhttp3/Request;IILjava/lang/String;JLjava/lang/String;IILjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
