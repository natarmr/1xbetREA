.class public final La/rag0;
.super La/sag0;
.source "SourceFile"


# static fields
.field public static final c:La/rag0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/rag0;

    .line 2
    .line 3
    const-string v1, "Unit"

    .line 4
    .line 5
    sget-object v2, La/b180;->t:La/b180;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, La/sag0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/rag0;->c:La/rag0;

    .line 11
    .line 12
    return-void
.end method
