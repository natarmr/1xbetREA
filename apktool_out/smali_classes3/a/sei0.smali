.class public final La/sei0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:La/sei0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/sei0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/sei0;->a:La/sei0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final serializer()La/jiy;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/jiy;"
        }
    .end annotation

    .line 1
    new-instance v0, La/leh0;

    .line 2
    .line 3
    sget-object p0, La/sre0;->a:La/tre0;

    .line 4
    .line 5
    const-class v1, La/dfi0;

    .line 6
    .line 7
    invoke-virtual {p0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-class v1, La/yei0;

    .line 12
    .line 13
    invoke-virtual {p0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-class v3, La/wei0;

    .line 18
    .line 19
    invoke-virtual {p0, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-class v4, La/bfi0;

    .line 24
    .line 25
    invoke-virtual {p0, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-class v5, La/cfi0;

    .line 30
    .line 31
    invoke-virtual {p0, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v5, 0x4

    .line 36
    move-object v6, v3

    .line 37
    new-array v3, v5, [La/sgy;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    aput-object v1, v3, v7

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    aput-object v6, v3, v1

    .line 44
    .line 45
    const/4 v6, 0x2

    .line 46
    aput-object v4, v3, v6

    .line 47
    .line 48
    const/4 v4, 0x3

    .line 49
    aput-object p0, v3, v4

    .line 50
    .line 51
    new-instance p0, La/g0o;

    .line 52
    .line 53
    sget-object v8, La/cfi0;->INSTANCE:La/cfi0;

    .line 54
    .line 55
    new-array v9, v7, [Ljava/lang/annotation/Annotation;

    .line 56
    .line 57
    const-string v10, "org.xplatform.consultantchat.data.models.SendMessageRequest.Unknown"

    .line 58
    .line 59
    invoke-direct {p0, v10, v8, v9}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 60
    .line 61
    .line 62
    new-array v5, v5, [La/jiy;

    .line 63
    .line 64
    sget-object v8, La/tei0;->a:La/tei0;

    .line 65
    .line 66
    aput-object v8, v5, v7

    .line 67
    .line 68
    sget-object v8, La/uei0;->a:La/uei0;

    .line 69
    .line 70
    aput-object v8, v5, v1

    .line 71
    .line 72
    sget-object v1, La/zei0;->a:La/zei0;

    .line 73
    .line 74
    aput-object v1, v5, v6

    .line 75
    .line 76
    aput-object p0, v5, v4

    .line 77
    .line 78
    new-array p0, v7, [Ljava/lang/annotation/Annotation;

    .line 79
    .line 80
    const-string v1, "org.xplatform.consultantchat.data.models.SendMessageRequest"

    .line 81
    .line 82
    move-object v4, v5

    .line 83
    move-object v5, p0

    .line 84
    invoke-direct/range {v0 .. v5}, La/leh0;-><init>(Ljava/lang/String;La/sgy;[La/sgy;[La/jiy;[Ljava/lang/annotation/Annotation;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method
