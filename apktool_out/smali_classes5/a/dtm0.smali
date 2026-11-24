.class public abstract La/dtm0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/a8z;

.field public static final b:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/x9m0;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/x9m0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La/wez;->b:La/wez;

    .line 9
    .line 10
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/dtm0;->a:La/a8z;

    .line 15
    .line 16
    new-instance v0, Lkotlin/text/Regex;

    .line 17
    .line 18
    const-string v1, "[\\x{1F000}-\\x{1FFFF}\\x{2600}-\\x{27BF}\\x{2300}-\\x{23FF}\\x{2B00}-\\x{2BFF}\\x{FE0F}\\x{200D}]"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/dtm0;->b:Lkotlin/text/Regex;

    .line 24
    .line 25
    return-void
.end method
