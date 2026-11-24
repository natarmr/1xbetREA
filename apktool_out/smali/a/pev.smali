.class public final La/pev;
.super La/rev;
.source "SourceFile"


# static fields
.field public static final b:La/pev;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/pev;

    .line 2
    .line 3
    const-string v1, "GRAPH_STOPPING"

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/rev;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/pev;->b:La/pev;

    .line 9
    .line 10
    return-void
.end method
