.class public final La/wmq0;
.super La/w46;
.source "SourceFile"


# static fields
.field public static final i:La/g9i0;


# instance fields
.field public final b:La/vzg0;

.field public final c:La/i1w0;

.field public final d:La/f5a;

.field public final e:La/duj;

.field public final f:La/p7m0;

.field public final g:La/p7m0;

.field public final h:La/ol60;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/g9i0;->c:La/g9i0;

    .line 2
    .line 3
    sput-object v0, La/wmq0;->i:La/g9i0;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(La/vzg0;La/i1w0;La/f5a;La/duj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wmq0;->b:La/vzg0;

    .line 5
    .line 6
    iput-object p2, p0, La/wmq0;->c:La/i1w0;

    .line 7
    .line 8
    iput-object p3, p0, La/wmq0;->d:La/f5a;

    .line 9
    .line 10
    iput-object p4, p0, La/wmq0;->e:La/duj;

    .line 11
    .line 12
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iput-object p2, p0, La/wmq0;->f:La/p7m0;

    .line 19
    .line 20
    const-string p2, "CURRENT_SELECTED_LIMIT_BUNDLE_KEY"

    .line 21
    .line 22
    invoke-virtual {p1, p2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/g9i0;

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    sget-object p1, La/wmq0;->i:La/g9i0;

    .line 31
    .line 32
    :cond_0
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/wmq0;->g:La/p7m0;

    .line 37
    .line 38
    new-instance p1, La/ol60;

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    sget-object p3, La/i99;->b:La/i99;

    .line 42
    .line 43
    invoke-direct {p1, p2, p3}, La/ol60;-><init>(ILa/i99;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/wmq0;->h:La/ol60;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final w(La/umq0;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/t6q0;

    .line 6
    .line 7
    const/16 v2, 0x11

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/t6q0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/ssl0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x1a

    .line 16
    .line 17
    invoke-direct {v4, p0, p1, v2, v3}, La/ssl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    const/16 v5, 0xe

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 24
    .line 25
    .line 26
    return-void
.end method
