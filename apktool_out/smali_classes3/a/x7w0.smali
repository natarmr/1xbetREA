.class public final La/x7w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:La/ln4;

.field public final c:Lorg/xplatform/fingerprint/impl/JniProfiler;

.field public final d:Lorg/xplatform/fingerprint/impl/MathTribunal;

.field public final e:Lorg/xplatform/fingerprint/impl/AudioTract;

.field public f:La/y8w0;

.field public g:La/y8w0;

.field public final h:La/n0o0;


# direct methods
.method public constructor <init>(La/us00;La/kys0;La/ln4;Lorg/xplatform/fingerprint/impl/JniProfiler;La/wxs0;Lorg/xplatform/fingerprint/impl/MathTribunal;Lorg/xplatform/fingerprint/impl/AudioTract;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x7w0;->a:La/us00;

    .line 5
    .line 6
    iput-object p3, p0, La/x7w0;->b:La/ln4;

    .line 7
    .line 8
    iput-object p4, p0, La/x7w0;->c:Lorg/xplatform/fingerprint/impl/JniProfiler;

    .line 9
    .line 10
    iput-object p6, p0, La/x7w0;->d:Lorg/xplatform/fingerprint/impl/MathTribunal;

    .line 11
    .line 12
    iput-object p7, p0, La/x7w0;->e:Lorg/xplatform/fingerprint/impl/AudioTract;

    .line 13
    .line 14
    sget-object p1, La/tvk;->a:La/rwj;

    .line 15
    .line 16
    sget-object p1, La/ys10;->a:La/vs10;

    .line 17
    .line 18
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance p2, La/wbl0;

    .line 23
    .line 24
    const/16 p3, 0x15

    .line 25
    .line 26
    const/4 p4, 0x0

    .line 27
    invoke-direct {p2, p0, p4, p3}, La/wbl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    const/4 p3, 0x3

    .line 31
    invoke-static {p1, p4, p4, p2, p3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 32
    .line 33
    .line 34
    new-instance p1, La/jmv0;

    .line 35
    .line 36
    const/16 p2, 0x12

    .line 37
    .line 38
    invoke-direct {p1, p0, p2}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, La/x7w0;->h:La/n0o0;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;
    .locals 1

    .line 1
    new-instance v0, La/n7w0;

    .line 2
    .line 3
    invoke-direct {v0}, La/n7w0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    new-instance p1, La/h6w0;

    .line 10
    .line 11
    iget-object v0, v0, La/n7w0;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method
