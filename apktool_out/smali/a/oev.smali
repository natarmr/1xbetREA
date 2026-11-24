.class public final La/oev;
.super La/rev;
.source "SourceFile"


# static fields
.field public static final b:La/oev;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/oev;

    .line 2
    .line 3
    const-string v1, "GRAPH_STOPPED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/rev;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/oev;->b:La/oev;

    .line 9
    .line 10
    return-void
.end method
