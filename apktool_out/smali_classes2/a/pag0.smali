.class public final La/pag0;
.super La/sag0;
.source "SourceFile"


# static fields
.field public static final c:La/pag0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/pag0;

    .line 2
    .line 3
    const-string v1, "Boolean"

    .line 4
    .line 5
    sget-object v2, La/b180;->r:La/b180;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, La/sag0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/pag0;->c:La/pag0;

    .line 11
    .line 12
    return-void
.end method
