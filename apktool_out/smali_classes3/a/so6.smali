.class public final La/so6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xr;

.field public final b:La/gs6;

.field public final c:La/knf0;

.field public final d:La/vby;

.field public final e:La/mne;

.field public final f:La/btt0;


# direct methods
.method public constructor <init>(La/xr;La/gs6;La/knf0;La/vby;La/mne;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/so6;->a:La/xr;

    .line 17
    .line 18
    iput-object p2, p0, La/so6;->b:La/gs6;

    .line 19
    .line 20
    iput-object p3, p0, La/so6;->c:La/knf0;

    .line 21
    .line 22
    iput-object p4, p0, La/so6;->d:La/vby;

    .line 23
    .line 24
    iput-object p5, p0, La/so6;->e:La/mne;

    .line 25
    .line 26
    iput-object p6, p0, La/so6;->f:La/btt0;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(La/uco;)Lokhttp3/RequestBody$Companion$toRequestBody$3;
    .locals 1

    .line 1
    sget v0, Lokhttp3/RequestBody;->a:I

    .line 2
    .line 3
    iget-object p0, p0, La/so6;->d:La/vby;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/uco;->Companion:La/tco;

    .line 9
    .line 10
    invoke-virtual {v0}, La/tco;->serializer()La/jiy;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, La/jiy;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, Lokhttp3/MediaType;->e:Lkotlin/text/Regex;

    .line 21
    .line 22
    const-string p1, "application/json; charset=utf-8"

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    invoke-static {p0, p1}, Lokhttp3/RequestBody$Companion;->a(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody$Companion$toRequestBody$3;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
