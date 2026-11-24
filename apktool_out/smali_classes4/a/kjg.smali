.class public final La/kjg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iqg;


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final INSTANCE:La/kjg;

.field public static final synthetic a:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/kjg;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/kjg;->INSTANCE:La/kjg;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/jcg;

    .line 11
    .line 12
    const/16 v2, 0x11

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/jcg;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, La/kjg;->a:La/a8z;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final serializer()La/jiy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/jiy;"
        }
    .end annotation

    .line 1
    sget-object p0, La/kjg;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jiy;

    .line 8
    .line 9
    return-object p0
.end method
