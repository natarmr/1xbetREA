.class public final synthetic La/x8e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BIILjava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/x8e;->a:B

    iput-object p4, p0, La/x8e;->d:Ljava/lang/Object;

    iput p2, p0, La/x8e;->b:I

    iput p3, p0, La/x8e;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/x8e;->a:B

    .line 2
    .line 3
    iget v1, p0, La/x8e;->c:I

    .line 4
    .line 5
    iget v2, p0, La/x8e;->b:I

    .line 6
    .line 7
    iget-object p0, p0, La/x8e;->d:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lokhttp3/internal/http2/Http2Connection;

    .line 13
    .line 14
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v0, v2, v1, v3}, Lokhttp3/internal/http2/Http2Writer;->l(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 23
    .line 24
    invoke-virtual {p0, v1, v1, v0}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p0, La/fae;

    .line 31
    .line 32
    invoke-virtual {p0, v2}, La/fae;->B(I)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/fae;->O:Ljava/lang/Integer;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-object v0, p0, La/fae;->B:La/ol60;

    .line 46
    .line 47
    new-instance v1, La/m6e;

    .line 48
    .line 49
    iget-object p0, p0, La/fae;->m:La/ctf0;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    new-array v3, v2, [Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 55
    .line 56
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const v3, 0x7f130d13

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {v1, p0}, La/m6e;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
